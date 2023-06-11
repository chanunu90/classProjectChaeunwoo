function makePage(page,size,total){
          console.log(page,size,total)

          const startNum = (Math.ceil(page/10) * 10) - 9
          console.log("startNum : " , startNum)

          let result = ``

          // 이전.
          if(startNum !== 1){
            result +=`<li class="page-item"><a class="page-link" href="${startNum -1}">&laquo;</a></li>`
          }

          let temp = startNum
          while(true){

            if(temp * size > total){
              break;
            }
            result += `<li class="page-item"><a class="page-link" href="${temp}">${temp}</a></li>`
            temp++;
          }


          if( total % (size * 10 ) === 1){
            result += `<li class="page-item"><a class="page-link" href="${startNum + 10}">&laquo;</a></li>`
          }

          console.log(result)
          return result;


      }